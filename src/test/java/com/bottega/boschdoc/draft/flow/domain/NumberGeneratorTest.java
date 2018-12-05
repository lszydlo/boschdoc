package com.bottega.boschdoc.draft.flow.domain;

import com.bottega.boschdoc.draft.flow.domain.ports.SysMode;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDate;

public class NumberGeneratorTest {


	@Test
	public void should_generate_number() {

		NumberGenerationPolicy iso = new NumberGenerationPolicy(SysMode.ISO, true, true, LocalDate.of(2018, 11, 22));

		Assertions.assertThat(iso.number()).isEqualTo("DEMO/ISO/123/11/2018/AUDIT");

	}
}
