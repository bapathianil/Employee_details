DROP TABLE IF EXISTS EMPLOYEE_DETAILS;
  
CREATE TABLE EMPLOYEE_DETAILS(
  emp_id INT PRIMARY KEY,
  emp_name VARCHAR(250) NOT NULL,
  emp_organisation VARCHAR(250) NOT NULL
);