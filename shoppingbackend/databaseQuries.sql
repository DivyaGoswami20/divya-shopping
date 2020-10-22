create table category(
id IDENTITY,
name VARCHAR(50),
desciption VARCHAR(255),
imageURL VARCHAR(50),
is_active boolean ,
CONSTRAINT pk_category_id PRIMARY KEY(id)	
);