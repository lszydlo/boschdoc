package com.bottega.boschdoc.draft.flow;

// typing IO

public class FlowCommandHandler {

	private DraftRepo repo;

	public void handle(DoCreateDraft command) {

		repo.apply(command.getId(), qDocDraft -> qDocDraft.create(command.getType()));

	}

	public void handle(DoVerifyDraft command) {

		repo.apply(command.getId(), QDocDraft::verify);

	}

	public void handle(DoPublishDraft command) {

		repo.apply(command.getId(), QDocDraft::publish);

	}

}
