package com.bottega.boschdoc.draft.flow.domain;

import java.util.UUID;
import java.util.function.Consumer;

class DraftRepo {
	QDocDraft load(UUID id) {
		return null;
	}

	public void save(QDocDraft draft) {

	}

	public void apply(UUID id, Consumer<QDocDraft> consumer) {
		QDocDraft load = load(id);
		consumer.accept(load);
		save(load);

	}
}
