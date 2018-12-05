package com.bottega.boschdoc.draft.flow.domain;

import com.bottega.boschdoc.draft.flow.domain.ports.CurrentTime;
import com.bottega.boschdoc.draft.flow.domain.ports.CurrentUser;
import com.bottega.boschdoc.draft.flow.domain.ports.SysMode;
import com.bottega.boschdoc.draft.flow.domain.ports.SystemConfig;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
// Factory
class NumberGenerator {


	private SystemConfig systemConfig;
	private CurrentUser currentUser;
	private CurrentTime currentTime;


	QDocNumber generate() {
		// --- data extraction  start--
		SysMode mode = systemConfig.getMode();
		boolean isDemo = systemConfig.isDemo();
		boolean isAuditor = currentUser.isAuditor();
		LocalDate date = currentTime.date();
		// --- data extraction  end--

		return new QDocNumber(new NumberGenerationPolicy(mode, isAuditor ,isDemo, date));
	}

}
