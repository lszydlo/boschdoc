package com.bottega.boschdoc.qoc.ack;

import com.bottega.boschdoc.qoc.ack.consumes.DoAckQDoc;
import com.bottega.boschdoc.qoc.ack.consumes.DoAckQDocOnBehalf;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AckCommandHandler {


	private AckRepo repo;

	void handle(DoAckQDoc command) {

		Ack ack = repo.load(command.getAckId());

		ack.acknowledge();


		repo.save(ack);
	}

	void handle(DoAckQDocOnBehalf command) {

		Ack ack = repo.load(command.getAckId());

		ack.acknowledgeOnBehalf();

		repo.save(ack);
	}


}
