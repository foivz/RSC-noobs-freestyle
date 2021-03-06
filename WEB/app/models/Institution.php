<?php

class Institution extends Eloquent {
	protected $guarded = array();

	public static $rules = array(
		'id' => 'required',
		'name' => 'required',
		'description' => 'required',
		'geo_lat' => 'required',
		'geo_long' => 'required'
	);

    public  function users()
    {
        return $this->hasMany('User');
    }

    public function donations()
    {
        return $this->hasMany('Donation');
    }

	public function supplies()
	{
		return $this->hasMany('BloodSupply');
	}


}
