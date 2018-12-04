package com.bottega.boschdoc.qoc.reader;


import com.bottega.boschdoc.qoc.ack.produces.AckWasCreated;
import com.bottega.boschdoc.qoc.ack.produces.QDocWasAcked;
import com.bottega.boschdoc.qoc.ack.produces.QDocWasAckedOnBehalf;
import com.bottega.boschdoc.user.UserWasUpdated;
import lombok.AllArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcOperations;

@AllArgsConstructor
public class AckEventListener {

	JdbcOperations operations;

	@EventListener
	public void listenOn(QDocWasAcked event) {
		operations.update("insert into ack_red_moedel (id, status) values (?, ?)", event.getQDocId(), false);

	}

	@EventListener
	public void listenOn(AckWasCreated event) {

	}

	@EventListener
	public void listenOn(QDocWasAckedOnBehalf event) {

	}

	@EventListener
	public void listenOn(UserWasUpdated event) {

	}





}
