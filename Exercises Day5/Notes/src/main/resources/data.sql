
insert into user (id, username, password) values (101,'ivana','ivana');
insert into user (id, username, password) values (102,'ana','ana');


insert into tag (id, name, user_Id) values (101, 'TagsSort', 101);
insert into tag(id, name, user_Id) values(102, 'TagFilter',102);

insert into notes (id, title, content, user_Id) values (101, 'SeavusTalent', 'Exercises', 101);
insert into notes (id, title, content, user_Id) values (102, 'SpringBoot', 'Application', 102);

insert into notes_tags(notes_Id,tags_Id) values(101,101);
insert into notes_tags(notes_Id,tags_Id) values(102,102);
