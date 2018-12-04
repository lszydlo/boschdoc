package com.bottega.boschdoc.qoc.ack;

import com.bottega.boschdoc.DomainEvent;
import com.bottega.boschdoc.qoc.ack.produces.QDocWasAcked;
import com.bottega.boschdoc.qoc.ack.produces.QDocWasAckedOnBehalf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Ack {

	private List<DomainEvent> events = new ArrayList<>();

	private String qdocId;
	private String empId;
	private String status;
	private LocalDate dueDate;

	void acknowledge() {
		status = "true";
		emit(new QDocWasAcked(qdocId));
	}

	private void emit(DomainEvent event) {
		events.add(event);
	}

	void acknowledgeOnBehalf() {
		status = "true";
		emit(new QDocWasAckedOnBehalf(qdocId, empId));
	}
}
