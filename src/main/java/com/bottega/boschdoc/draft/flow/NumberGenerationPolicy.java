package com.bottega.boschdoc.draft.flow;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
class NumberGenerationPolicy {
	static final private String STRING = "/";
	private String mode;
	private boolean isAuditor;
	private boolean isDemo;
	private LocalDate date;



	String number() {
		String number = mode + STRING + "123" + STRING + date.getMonthValue() + STRING + date.getYear();

		if (isDemo) {
			number = "DEMO/" + number;
		}

		if (isAuditor) {
			number = number + "/AUDIT";
		}
		return number;
	}
}
