package com.bottega.boschdoc.draft.flow;

// typing IO

public class FlowCommandHandler {

	private DraftRepo repo;
	private NumberGenerator numberGenerator;

	public void handle(DoCreateDraft command) {

		repo.apply(command.getId(), qDocDraft -> {

			NumberGenerator.QDocNumber number = numberGenerator.generate();

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
