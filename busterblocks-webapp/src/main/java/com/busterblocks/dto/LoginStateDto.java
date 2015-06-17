package com.busterblocks.dto;

public final class LoginStateDto {

	private boolean loggedIn;
	private String targetPage;

	public String consumeTargetPage() {
		final String consumedTargetPage = getTargetPage();
		setTargetPage(null);
		return consumedTargetPage;
	}

	public String getTargetPage() {
		return targetPage;
	}

	public void setTargetPage(String targetPage) {
		this.targetPage = targetPage;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
}
