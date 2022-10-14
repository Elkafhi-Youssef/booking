create table if not exists room_types (
  id serial primary key,
  name text not null
);

create table if not exists rooms (
  id serial primary key,
  room_type  int references room_types(id),
  price int not null,
  images text[]
);

create table if not exists promotions (
  id serial primary key,
  type_id int references rooms(id)
);

create table if not exists users (
  id serial primary key,
  name text not null,
  email text not null,
  psswd text not null
);

create table if not exists reservations (
  start_date date  not null,
  end_date date not null,
  user_id int references users(id),
  room_id int references rooms(id),
  extras json
);

