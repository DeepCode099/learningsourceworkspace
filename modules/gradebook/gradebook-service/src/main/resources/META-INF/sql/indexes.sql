create index IX_14D546B8 on Gradebook_Assignment (groupId);
create index IX_51DB1FA6 on Gradebook_Assignment (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F2D357A8 on Gradebook_Assignment (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E84495D5 on Gradebook_Submission (groupId, assignmentId);
create index IX_A7930351 on Gradebook_Submission (studentId, assignmentId);
create index IX_7C659EA5 on Gradebook_Submission (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_1F9F8A67 on Gradebook_Submission (uuid_[$COLUMN_LENGTH:75$], groupId);