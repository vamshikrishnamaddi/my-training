create table Zain_normal (
	sampleId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	catalog VARCHAR(75) null,
	governorate VARCHAR(75) null,
	areazone VARCHAR(75) null
);