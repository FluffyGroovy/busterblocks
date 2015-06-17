package com.busterblocks.rental.persistence.table.manager;

import com.busterblocks.rental.persistence.table.dao.LastVideoRentalViewDtoDAO;
import com.busterblocks.rental.persistence.table.dto.LastVideoRentalViewDto;
import com.busterblocks.rental.persistence.table.dto.LastVideoRentalViewDtoExample;
import com.busterblocks.rental.persistence.table.dto.VideoRentalDto;
import com.busterblocks.rental.structure.VideoRental;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LastVideoRentalDtoDaoManager {

	private LastVideoRentalViewDtoDAO lastVideoRentalViewDtoDAO;

	protected LastVideoRentalViewDto retrieveLastRentalDto(final String videoItemId) {
		final LastVideoRentalViewDtoExample lastVideoRentalViewDtoExample = new LastVideoRentalViewDtoExample();
		final LastVideoRentalViewDtoExample.Criteria criteria = lastVideoRentalViewDtoExample.createCriteria();
		criteria.andVIDEO_ITEM_IDEqualTo(new BigDecimal(videoItemId));
		final Collection<LastVideoRentalViewDto> result = getLastVideoRentalViewDtoDAO().selectByExample(lastVideoRentalViewDtoExample);
		if ((result != null) && !result.isEmpty()) {
			return result.iterator().next();
		}
		return null;
	}

	public Map<String, VideoRental> retrieveLastRentals(final Collection<String> videoItemIds) {
		final List<BigDecimal> videoItemIdList = new ArrayList<>();
		for (final String videoItemId : videoItemIds) {
			videoItemIdList.add(new BigDecimal(videoItemId));
		}

		final LastVideoRentalViewDtoExample lastVideoRentalViewDtoExample = new LastVideoRentalViewDtoExample();
		final LastVideoRentalViewDtoExample.Criteria criteria = lastVideoRentalViewDtoExample.createCriteria();
		criteria.andVIDEO_ITEM_IDIn(videoItemIdList);
		final Collection<LastVideoRentalViewDto> result = getLastVideoRentalViewDtoDAO().selectByExample(lastVideoRentalViewDtoExample);
		final Map<String, VideoRental> lastRentals = transform(result);
		return lastRentals;
	}

	private Map<String, VideoRental> transform(final Collection<LastVideoRentalViewDto> lastVideoRentalViewDtos) {
		final Map<String, VideoRental> lastRentals = new HashMap<>();
		if (lastVideoRentalViewDtos != null) {
			for (final LastVideoRentalViewDto lastVideoRentalViewDto : lastVideoRentalViewDtos) {
				final VideoRental videoRental = new VideoRental(
						lastVideoRentalViewDto.getVIDEO_RENTAL_ID().toString(),
						null,
						null,
						new DateTime(lastVideoRentalViewDto.getDATE_BORROWED()),
						(lastVideoRentalViewDto.getDATE_DUE() != null) ? new DateTime(lastVideoRentalViewDto.getDATE_DUE()) : null,
						(lastVideoRentalViewDto.getDATE_RETURNED() != null) ? new DateTime(lastVideoRentalViewDto.getDATE_RETURNED()) : null,
						lastVideoRentalViewDto.getCOMMENTS()
				);
				lastRentals.put(lastVideoRentalViewDto.getVIDEO_ITEM_ID().toString(), videoRental);
			}
		}
		return lastRentals;
	}

	private LastVideoRentalViewDtoDAO getLastVideoRentalViewDtoDAO() {
		return lastVideoRentalViewDtoDAO;
	}

	public void setLastVideoRentalViewDtoDAO(LastVideoRentalViewDtoDAO lastVideoRentalViewDtoDAO) {
		this.lastVideoRentalViewDtoDAO = lastVideoRentalViewDtoDAO;
	}
}
