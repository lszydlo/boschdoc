package com.bottega.boschdoc.draft.flow.domain.produces;

import com.bottega.boschdoc.DomainEvent;
import com.bottega.boschdoc.draft.flow.domain.QDocType;
import lombok.Value;

import java.util.UUID;

@Value
public class DraftWasCreated implements DomainEvent {

	private final UUID id;
	private final UUID authorId;
	private final QDocType type;
	private final String number;
}
