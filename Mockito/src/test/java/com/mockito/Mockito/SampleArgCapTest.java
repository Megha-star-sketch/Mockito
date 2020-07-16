package com.mockito.Mockito;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatcher;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class SampleArgCapTest {
	@Test
	public void doSomeCheckWithCaptor()
	{
		final Sample sample=mock(Sample.class);
		when(sample.getName()).thenReturn("Megha");
		final Sample other=new SampleImp();
		other.setName("Malik");
		sample.setOtherSample(other);
		ArgumentCaptor<Sample> cap=ArgumentCaptor.forClass(Sample.class);
		verify(sample).setOtherSample(cap.capture());
		assertEquals("Wrong","Megha",cap.getValue().getName());
	}
//	@Test  // for ArgumentMatcher
//	public void doSomeChecksWithAnswer() {
//	  final Sample sample = mock(Sample.class);
//	  when(sample.setOtherSample(argThat(new ArgumentMatcher<Sample>() {
//	    @Override
//	    public boolean matches(final Object argument) {
//	      assertEquals("Wrong name", "name", ((Sample) argument).getName());
//	      return true;
//	    }
//	  }))).thenReturn(Boolean.TRUE);
//	  final Sample other = new SampleImp();
//	  other.setName("otherName");
//	  sample.setOtherSample(other);
//	}
}
