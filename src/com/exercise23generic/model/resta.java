package com.exercise23generic.model;

public class resta <X, Y>
{
	X key;
	Y value;
	public resta()
	{
	}
	public resta(X key, Y value)
	{
		this.key = key;
		this.value = value;
		
	}
	public X getKey()
	{
		return this.key;
	}
	public void setKey(X key)
	{
		this.key = key;
	}
	public Y getValuee()
	{
		return this.value;
	}
	public void setValue(Y value)
	{
		this.value = value;
	}
	public String ToString()
	{
		return "key: "+this.key+" value "+this.value;
	}
	

}
