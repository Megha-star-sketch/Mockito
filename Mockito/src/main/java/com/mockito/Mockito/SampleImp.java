package com.mockito.Mockito;

public class SampleImp implements Sample{
	private String name;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setOtherSample(final Sample sample)
	{
		
	}
}
