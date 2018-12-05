package com.bottega.boschdoc.draft.flow.domain.consumes;

import com.bottega.boschdoc.draft.flow.domain.QDocType;
import lombok.Data;

import java.util.UUID;

@Data
public class DoCreateDraft {

	UUID id;
	QDocType type;
}
