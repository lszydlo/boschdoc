package com.bottega.boschdoc.draft.flow.domain.ports;

public interface SystemConfig {
	SysMode getMode();

	boolean isDemo();
}
