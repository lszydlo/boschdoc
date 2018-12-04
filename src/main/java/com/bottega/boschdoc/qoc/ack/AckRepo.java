package com.bottega.boschdoc.qoc.ack;

public interface AckRepo {
	Ack load(String ackId);

	void save(Ack ack);
}
