import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI_app implements ActionListener{
  
  // label for button	
  static JButton Total_calories;
  
  // define checkbox variables 
  JCheckBox Cheese_burger; 
  JCheckBox Fish_burger; 
  JCheckBox Veggie_burger; 
  JCheckBox No_burger;
  
  JCheckBox Soft_drink;
  JCheckBox Orange_juice; 
  JCheckBox Milk;
  
  
  JCheckBox Fries; 
  JCheckBox Baked_potato; 
  JCheckBox Chef_salad; 
  JCheckBox No_side_order;
  
  
  JCheckBox Apple_pie; 
  JCheckBox Sundae; 
  JCheckBox Fruit_cup; 
  JCheckBox No_dessert; 
  
  // label for calorie count text
  JLabel totalCaloriesCount;
  
  // value of label for calorie count integer
  JLabel totalCaloriesCountCalculated;
  
  
  public void menu_app(){
 
  //create the frame and the panel
	  
  // create the frame 
  JFrame frm = new JFrame();
  
  // create the main panel
  JPanel panel = new JPanel();
  panel.setLayout(new GridLayout(4, 2));
  //panel.setBackground(Color.cyan);
  //panel.setBorder(BorderFactory.createEtchedBorder());  
  
  // Create Burger Panel and add Check Boxes
  // ------------------------------------------------------------------------
  JPanel burgerPanel = new JPanel();
  burgerPanel.setLayout(new GridLayout(5,1));
  //burgerPanel.setBackground(Color.yellow);
  burgerPanel.setBorder(BorderFactory.createTitledBorder("Burger Panel"));
  
  JLabel burgerLabel = new JLabel("Please enter a burger choice:");
  burgerLabel.setHorizontalAlignment(JLabel.LEFT);
  burgerLabel.setSize(300,50);
  
 
  //burger menu
  Cheese_burger = new JCheckBox("Cheese burger");
  Fish_burger = new JCheckBox("Fish burger");
  Veggie_burger = new JCheckBox("Veggie burger");
  No_burger = new JCheckBox("No burger");
  
  burgerPanel.add(burgerLabel);
  burgerPanel.add(Cheese_burger);
  burgerPanel.add(Fish_burger);
  burgerPanel.add(Veggie_burger);   
  burgerPanel.add(No_burger);  

  
  
  // Create Drinks Panel and add Check Boxes
  // ------------------------------------------------------------------------
  JPanel drinksPanel = new JPanel();
  drinksPanel.setLayout(new GridLayout(5,1));
  // drinksPanel.setLayout(new FlowLayout());
  //drinksPanel.setBackground(Color.yellow);
  drinksPanel.setBorder(BorderFactory.createTitledBorder("Drinks Panel"));
  
  JLabel drinksLabel = new JLabel("Please enter a drink choice:");
  drinksLabel.setHorizontalAlignment(JLabel.LEFT);
  drinksLabel.setSize(300,50);
  
  //drinks menu
  Soft_drink = new JCheckBox("Soft drink");
  Orange_juice = new JCheckBox("Orange Juice");
  Milk = new JCheckBox("Milk");
  
  
  drinksPanel.add(drinksLabel);
  drinksPanel.add(Soft_drink);
  drinksPanel.add(Orange_juice);
  drinksPanel.add(Milk);
    
  
  //Create Side Order Panel and add Check Boxes
  // ------------------------------------------------------------------------
  JPanel sideOrderPanel = new JPanel();
  sideOrderPanel.setLayout(new GridLayout(5,1));
  //sideOrderPanel.setBackground(Color.yellow);
  sideOrderPanel.setBorder(BorderFactory.createTitledBorder("Side Order Panel"));
  
  JLabel sideOrderLabel = new JLabel("Please enter a side order choice:");
  sideOrderLabel.setHorizontalAlignment(JLabel.LEFT);
  sideOrderLabel.setSize(300,50);
  
  Fries = new JCheckBox("Fries");
  Baked_potato = new JCheckBox("Baked potato");
  Chef_salad = new JCheckBox("Chef salad");
  No_side_order = new JCheckBox("No side order");
  
  
  sideOrderPanel.add(Fries);
  sideOrderPanel.add(Baked_potato);
  sideOrderPanel.add(Chef_salad);
  sideOrderPanel.add(No_side_order);
  
  //Create deserts Panel and add Check Boxes
  // ------------------------------------------------------------------------
  JPanel desertsPanel = new JPanel();
  desertsPanel.setLayout(new GridLayout(5,1));
  //desertsPanel.setBackground(Color.yellow);
  desertsPanel.setBorder(BorderFactory.createTitledBorder("Deserts Panel"));
  
  JLabel desertsLabel = new JLabel("Please enter a deserts choice:");
  desertsLabel.setHorizontalAlignment(JLabel.LEFT);
  desertsLabel.setSize(300,50);
  
  Apple_pie = new JCheckBox("Apple pie");
  Sundae = new JCheckBox("Sundae");
  Fruit_cup = new JCheckBox("Fruit cup");
  No_dessert = new JCheckBox("No dessert");
  
  
  desertsPanel.add(Apple_pie);
  desertsPanel.add(Sundae);
  desertsPanel.add(Fruit_cup);
  desertsPanel.add(No_dessert);
  
  
  
  // Add all panels to main panel
  // -----------------------------------------------------------------------------
  panel.add(burgerPanel);
  panel.add(drinksPanel);
  panel.add(sideOrderPanel);
  panel.add(desertsPanel);
  
  
  
  JPanel calorieCalculatePanel = new JPanel();
  //calorieCalculatePanel.setLayout(new GridLayout(5,1));
  //desertsPanel.setBackground(Color.yellow);
  calorieCalculatePanel.setBorder(BorderFactory.createTitledBorder("Calorie Calculate Panel"));
  
  
  //total calorie button
  Total_calories = new JButton("Total calories");
  calorieCalculatePanel.add(Total_calories);

  
  totalCaloriesCount = new JLabel("Your total calorie count is :");
  totalCaloriesCount.setHorizontalAlignment(JLabel.LEFT);
  totalCaloriesCount.setSize(300,50);
  
  calorieCalculatePanel.add(totalCaloriesCount);
  
  
  totalCaloriesCountCalculated = new JLabel("");
  totalCaloriesCountCalculated.setHorizontalAlignment(JLabel.LEFT);
  totalCaloriesCountCalculated.setSize(300,50);
  
  calorieCalculatePanel.add(totalCaloriesCountCalculated);
  
  
  panel.add(calorieCalculatePanel);
  

  //Add main panel to frame
  // -----------------------------------------------------------------------------
  frm.add(panel);
  
  frm.setSize(800,800);
  frm.setVisible(true); 
  
  
  
  // Add action listener to all components
  // --------------------------------------------------------------------------------
  Total_calories.addActionListener(this);

  
  Cheese_burger.addActionListener(this);
  Fish_burger.addActionListener(this);
  Veggie_burger.addActionListener(this);
  No_burger.addActionListener(this);

  Soft_drink.addActionListener(this);
  Orange_juice.addActionListener(this);
  Milk.addActionListener(this);

  Fries.addActionListener(this);
  Baked_potato.addActionListener(this);
  Chef_salad.addActionListener(this);
  No_side_order.addActionListener(this);

  Apple_pie.addActionListener(this);
  Sundae.addActionListener(this);
  Fruit_cup.addActionListener(this);
  No_dessert.addActionListener(this);
  
  
  
  
   

  /*  
  //drink menu
  JCheckBox Soft_drink = new JCheckBox("Soft drink");
  content.add(Soft_drink);

  JCheckBox Orange_juice = new JCheckBox("Orange Juice");
  content.add(Orange_juice);

  JCheckBox Milk = new JCheckBox("Milk");
  content.add(Milk);

    frm.setSize(400,400);
    frm.setVisible(true);

  //Side order menu
  JCheckBox Fries = new JCheckBox("Fries");
  content.add(Fries);

  JCheckBox Baked_potato = new JCheckBox("Baked potato");
  content.add(Baked_potato);

  JCheckBox Chef_salad = new JCheckBox("Chef salad");
  content.add(Chef_salad);

  JCheckBox No_side_order = new JCheckBox("No side order");
  content.add(No_side_order);

    frm.setSize(800,800);
    frm.setVisible(true);
  
  //dessert menu
 
  JCheckBox Apple_pie = new JCheckBox("Apple pie");
  content.add(Apple_pie);

  JCheckBox Sundae = new JCheckBox("Sundae");
  content.add(Sundae);

  JCheckBox Fruit_cup = new JCheckBox("Fruit cup");
  content.add(Fruit_cup);

  JCheckBox No_dessert = new JCheckBox("No dessert");
  content.add(No_dessert);



  //total calorie button
  Total_calories = new JButton("Total calories");
  content.add(Total_calories);

  Total_calories.addActionListener(this);

  Cheese_burger.addActionListener(this);
  Fish_burger.addActionListener(this);
  Veggie_burger.addActionListener(this);
  No_burger.addActionListener(this);

  Soft_drink.addActionListener(this);
  Orange_juice.addActionListener(this);
  Milk.addActionListener(this);

  Fries.addActionListener(this);
  Baked_potato.addActionListener(this);
  Chef_salad.addActionListener(this);
  No_side_order.addActionListener(this);

  Apple_pie.addActionListener(this);
  Sundae.addActionListener(this);
  Fruit_cup.addActionListener(this);
  No_dessert.addActionListener(this);

  */

  }//method menu_app
  public void actionPerformed(ActionEvent e){
	  
	int cheeseBurger = 461;
	int fishBurger = 431;
	int veggieBurger= 420;
	int noBurger = 0;
	
	int softDrink = 130;
	int orangeJuice = 160;
	int milk = 118;
	int noDrink = 0;
	
	int fries = 100;
	int bakedPotato = 57;
	int chefSalad= 70;
	int noSide = 0;
	
	int applePie = 461;
	int sundae = 431;
	int fruitCup = 420;
	int noDesert = 0;
	
	int calorieCount = 0;
	
	
    if (e.getSource() == Total_calories)
    	System.out.println("Works using button");
    
    // add calories of burgers
    // -------------------------------------------
    if(Cheese_burger.isSelected()) {
    	calorieCount = calorieCount + cheeseBurger;
    }
    
    if(Fish_burger.isSelected()) {
    	calorieCount = calorieCount + fishBurger;
    }
    
    if(Veggie_burger.isSelected()) {
    	calorieCount = calorieCount + veggieBurger;
    }
    if(No_burger.isSelected()) {
    	calorieCount = calorieCount + noBurger;
    }
    
    
    // add calories of drinks
    // -------------------------------------------
    
    if(Soft_drink.isSelected()) {
    	calorieCount = calorieCount + softDrink;
    }
    
    if(Orange_juice.isSelected()) {
    	calorieCount = calorieCount + orangeJuice;
    }
    
    if(Milk.isSelected()) {
    	calorieCount = calorieCount + milk;
    }
    
    //  add calories of side orders
    // -------------------------------------------
    
    if(Fries.isSelected()) {
    	calorieCount = calorieCount + fries;
    }
    
    if(Baked_potato.isSelected()) {
    	calorieCount = calorieCount + bakedPotato;
    }
    
    if(Chef_salad.isSelected()) {
    	calorieCount = calorieCount + chefSalad;
    }
    if(No_side_order.isSelected()) {
    	calorieCount = calorieCount + noSide;
    }
    
    
    //  add calories of deserts
    // -------------------------------------------
    
    if(Apple_pie.isSelected()) {
    	calorieCount = calorieCount + applePie;
    }
    
    if(Sundae.isSelected()) {
    	calorieCount = calorieCount + sundae;
    }
    
    if(Fruit_cup.isSelected()) {
    	calorieCount = calorieCount + fruitCup;
    }
    if(No_dessert.isSelected()) {
    	calorieCount = calorieCount + noDesert;
    }
    
    
    
    //Shows calorie count beside label
    totalCaloriesCountCalculated.setText(new String(String.valueOf(calorieCount)));
    
  }//actionPerformed method

}//GUI_app class
 
