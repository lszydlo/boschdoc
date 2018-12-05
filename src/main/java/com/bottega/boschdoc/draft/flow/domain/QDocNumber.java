package com.bottega.boschdoc.draft.flow.domain;


// Value Object
class QDocNumber {

	final private String number;

	QDocNumber(NumberGenerationPolicy numberGenerationPolicy) {

		this.number = numberGenerationPolicy.number();
	}

	String getNumberValue() {
		return number;
	}
}
