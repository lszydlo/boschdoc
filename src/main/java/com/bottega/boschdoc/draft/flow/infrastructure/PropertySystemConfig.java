package com.bottega.boschdoc.draft.flow.infrastructure;

import com.bottega.boschdoc.draft.flow.domain.ports.SysMode;
import com.bottega.boschdoc.draft.flow.domain.ports.SystemConfig;

public class PropertySystemConfig implements SystemConfig {
	@Override
	public SysMode getMode() {
		String mode = System.getProperty("mode");
		return SysMode.valueOf(mode);
	}

	@Override
	public boolean isDemo() {
		return false;
	}
}
