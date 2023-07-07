create table Zain_City (
	uuid_ VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	id_ INTEGER not null primary key,
	city VARCHAR(75) null,
	state_id INTEGER
);