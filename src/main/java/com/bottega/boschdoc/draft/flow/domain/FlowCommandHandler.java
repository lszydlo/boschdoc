package com.bottega.boschdoc.draft.flow.domain;

// typing IO

import com.bottega.boschdoc.draft.flow.domain.consumes.DoCreateDraft;
import com.bottega.boschdoc.draft.flow.domain.consumes.DoPublishDraft;
import com.bottega.boschdoc.draft.flow.domain.consumes.DoVerifyDraft;

public class FlowCommandHandler {

	private DraftRepo repo;
	private NumberGenerator numberGenerator;

	public void handle(DoCreateDraft command) {

		repo.apply(command.getId(), qDocDraft -> {

			QDocNumber number = numberGenerator.generate();

			qDocDraft.create(command.getType(),number);
		});

	}

	public void handle(DoVerifyDraft command) {

		repo.apply(command.getId(), QDocDraft::verify);

	}

	public void handle(DoPublishDraft command) {

		repo.apply(command.getId(), QDocDraft::publish);

	}

}
