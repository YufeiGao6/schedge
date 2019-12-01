CREATE TABLE public.courses (
  id                  SERIAL        NOT NULL UNIQUE,
  name                varchar(128)  NOT NULL,
  school              varchar(4)    NOt NULL,
  subject             varchar(4)    NOT NULL,
  dept_course_number  integer       NOT NULL,
  term_id             integer       NOT NULL,
  PRIMARY KEY (term_id, school, subject, dept_course_number)
);

CREATE TABLE public.sections (
  id                  SERIAL                      NOT NULL UNIQUE,
  registration_number integer                     NOT NULL,
  course_id           int REFERENCES courses(id)  NOT NULL,
  section_code        varchar(5)                  NOT NULL,
  instructor          text                        NOT NULL,
  section_type        integer                     NOT NULL,
  associated_with     integer,
  PRIMARY KEY (course_id, section_code, registration_number)
);

CREATE TABLE public.meetings (
  id                  SERIAL                          NOT NULL,
  section_id          int REFERENCES sections(id)     NOT NULL,
  begin_date          timestamp without time zone     NOT NULL,
  end_date            timestamp without time zone     NOT NULL,
  duration            bigint                          NOT NULL,
  PRIMARY KEY (id)
);


CREATE UNIQUE INDEX course_idx ON courses (id);
CREATE UNIQUE INDEX section_idx ON sections (id);
CREATE INDEX sections_associated_with ON sections (associated_with);
