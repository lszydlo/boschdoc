package com.bottega.boschdoc.draft.flow;

class NumberGenerator {



	QDocNumber generate() {

		return new QDocNumber("sdsd");
	}

	static class QDocNumber {

		final String number;


		private QDocNumber(String number) {
			this.number = number;
		}
	}
}
