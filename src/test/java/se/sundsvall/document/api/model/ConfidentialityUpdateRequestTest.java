package se.sundsvall.document.api.model;

import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanConstructor;
import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanEquals;
import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanHashCode;
import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanToString;
import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class ConfidentialityUpdateRequestTest {

	@Test
	void testBean() {
		assertThat(ConfidentialityUpdateRequest.class, allOf(
			hasValidBeanConstructor(),
			hasValidGettersAndSetters(),
			hasValidBeanHashCode(),
			hasValidBeanEquals(),
			hasValidBeanToString()));
	}

	@Test
	void testBuilderMethods() {

		final var changedBy = "user";
		final var confidential = true;
		final var legalCitation = "legalCitation";

		final var bean = ConfidentialityUpdateRequest.create()
			.withChangedBy(changedBy)
			.withConfidential(confidential)
			.withLegalCitation(legalCitation);

		assertThat(bean).isNotNull().hasNoNullFieldsOrProperties();
		assertThat(bean.getChangedBy()).isEqualTo(changedBy);
		assertThat(bean.getConfidential()).isTrue();
		assertThat(bean.getLegalCitation()).isEqualTo(legalCitation);
	}

	@Test
	void testNoDirtOnCreatedBean() {
		assertThat(ConfidentialityUpdateRequest.create()).hasAllNullFieldsOrProperties();
		assertThat(new ConfidentialityUpdateRequest()).hasAllNullFieldsOrProperties();
	}
}
