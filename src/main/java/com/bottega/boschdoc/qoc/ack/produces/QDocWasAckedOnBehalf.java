package com.bottega.boschdoc.qoc.ack.produces;

import com.bottega.boschdoc.DomainEvent;
import lombok.Value;

@Value
public class QDocWasAckedOnBehalf implements DomainEvent {

	String qDocId;
	String empId;
}
