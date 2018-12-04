package com.bottega.boschdoc.qoc.reader;

import com.bottega.boschdoc.qoc.reader.consumes.GetAckDetails;
import com.bottega.boschdoc.user.GetUserQuery;
import com.bottega.boschdoc.user.UserQueryHandler;
import com.bottega.boschdoc.user.UserReadModel;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AckQueryHandler {


	AckReadModelDao dao;
	UserQueryHandler queryHandler;


	AckReadModel handle(GetAckDetails query) {
		AckReadModel one = dao.getOne(query.getId());
		///UserReadModel userReadModel = queryHandler.handle(new GetUserQuery());
		//one.setUsername(userReadModel.getName());
		return one;
	}

}
