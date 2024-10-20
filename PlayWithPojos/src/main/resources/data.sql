INSERT INTO app_user (id, username, password) VALUES (1, 'admin', '$2a$10$W92uyesczudjdYURrAieUOkTGTyVzrPABsx/tsuLQzEYouU84swJS');
INSERT INTO role (id, name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO user_roles (user_id, role_id) VALUES (1, 1);

