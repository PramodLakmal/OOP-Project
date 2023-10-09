CREATE TABLE IF NOT EXISTS `user` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `fname` varchar(255) NOT NULL,
    `lname` varchar(255) NOT NULL,
    `email` varchar(255) NOT NULL,
    `password` varchar(255) NOT NULL,
    `role` varchar(50) NOT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `user` (`id`, `fname`, `lname`, `email`, `password`, `role`)
VALUES
    (1, 'Admin', 'admin', 'admin@gmail.com', 'pass', 'admin'),
    (2, 'aaa', 'bbb', 'aaa@gmail.com', 'pass', 'user'),
    (3, 'bbb', 'ccc', 'bbb@gmail.com', 'pass', 'user'),
    (4, 'ccc', 'ddd', 'ccc@gmail.com', 'pass', 'user'),
    (5, 'ddd', 'eee', 'ddd@gmail.com', 'pass', 'user'),
    (6, 'eee', 'fff', 'eee@gmail.com', 'pass', 'user');

