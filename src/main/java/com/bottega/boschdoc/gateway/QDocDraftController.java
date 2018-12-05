package com.bottega.boschdoc.gateway;

import com.bottega.boschdoc.draft.flow.domain.consumes.DoCreateDraft;
import com.bottega.boschdoc.draft.flow.domain.FlowCommandHandler;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

@RestController
@RequestMapping("/qdocdrafts")
@AllArgsConstructor
public class QDocDraftController {

	private final FlowCommandHandler handler;


	@PostMapping
	ResponseEntity<Void> create(@RequestBody DoCreateDraft command) throws URISyntaxException {
		UUID id = UUID.randomUUID();
		command.setId(id);

		handler.handle(command);

		return ResponseEntity.created(new URI("/qdocdrafts/" + id)).build();
	}

}
