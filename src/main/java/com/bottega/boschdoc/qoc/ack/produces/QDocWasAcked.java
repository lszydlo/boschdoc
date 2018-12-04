package com.bottega.boschdoc.qoc.ack.produces;

import com.bottega.boschdoc.DomainEvent;
import lombok.Value;

@Value
public class QDocWasAcked implements DomainEvent {

	String qDocId;
}
