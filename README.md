# Hibernate_utilityClass

To configure hibernate file in idea perform the following step:
1 create resources folder in src/main/
2 put your hibernate configuration file in this location.
3 goto -> project structure -> Modules -> expand to resources folder -> left click on resource folder and mark as "Resources"
4 In utitlity class: StandardServiceRegistry serviceRegistry = builder.configure("cfg.xml").build();
