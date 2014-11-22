<?php

class DatabaseSeeder extends Seeder {

	/**
	 * Run the database seeds.
	 *
	 * @return void
	 */
	public function run()
	{
		Eloquent::unguard();

		$this->call('InstitutionsTableSeeder');
		$this->call('PremissionsTableSeeder');
		$this->call('EmployeesTableSeeder');
		$this->call('BloodsTableSeeder');
		$this->call('UsersTableSeeder');
		$this->call('DonationsTableSeeder');
	}

}