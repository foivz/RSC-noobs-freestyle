<?php

/*
|--------------------------------------------------------------------------
| Application Routes
|--------------------------------------------------------------------------
|
| Here is where you can register all of the routes for an application.
| It's a breeze. Simply tell Laravel the URIs it should respond to
| and give it the Closure to execute when that URI is requested.
|
*/

Route::get('/login', 'UsersController@login');
Route::post('/login', 'UsersController@web_Auth');


Route::resource('institutions', 'InstitutionsController');

Route::resource('premissions', 'PremissionsController');

Route::resource('employees', 'EmployeesController');

Route::resource('bloods', 'BloodsController');

Route::resource('users', 'UsersController');

Route::resource('donations', 'DonationsController');

Route::resource('bloodsupplies', 'BloodsuppliesController');