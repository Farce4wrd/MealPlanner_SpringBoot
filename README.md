# MealPlanner_SpringBoot
Project: Building a full-stack weight loss app with springboot and angular

Description: For every ingredient the user has, the user can choose/form a meal option from those ingredients and make a less caloric meal from expert videos. This app should be able to calculate the calories of each ingredient and the full calories of each meal and make a meal planner for the user. We would have a database of common food ingredients (rice, egg, etc) as well as 


Front-end: Display that lets user pick the ingredients available. Choose predominant ingredient and choose ingredient that they do not want at all. Each ingredient should have its own caloric info separately per ounce and there would be caloric info on the whole food itself. Final results should show picture of the complete meal and links to recipe/videos on how to make it. It should also show a button that allows users to add it into meal plan. (If possible, give warnings if app recognizes too high a sugar/cholestrol diet it finds)


Back-end: Remote Database w/psql stored on Docker
------- Have Meal planner database
------------Contains meal models
------------Contains warning message if it exceeds the regular diet
------------------
------- Have Meals model database
----------Meal name
-------------- recipe
-------------- caloric info
--------------rely on ingredients model (This could be a database on its own)
-----------------------ingredients name
---------------------------------- average cost
---------------------------------- calorie (on its own)
---------------------------------- 
----------Spring Security
------------login forms to ensure users have name and password
[This could potentially change during stages of development]
