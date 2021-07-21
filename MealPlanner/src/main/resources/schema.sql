CREATE TABLE INGREDIENT(
	INGREDIENT_ID INT AUTO_INCREMENT PRIMARY KEY,
	INGREDIENT_NAME VARCHAR(16) ,
	INGREDIENT_COST CHAR(4) ,
	INGREDIENT_CALORIES CHAR(6)
	
	

);

CREATE TABLE MEAL(
	
	MEAL_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	MEAL_NAME VARCHAR(64) NOT NULL,
	MARKET_COST CHAR(4) NOT NULL,
	OVERALL_COST CHAR(4) NOT NULL,
	MEAL_CALORIES CHAR(6) NOT NULL
	
	

);
