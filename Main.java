import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
		admin hussam=new admin();
        //String databaseURL = "jdbc:ucanaccess://C://Users//H.T//Documents//library.accdb";
		JFrame loginFrame = new JFrame("Login");
		JFrame usersFrame = new JFrame("Admin");
		JFrame viewUsersFrame = new JFrame("View Users");
		JFrame addUserFrame = new JFrame("Add User");
		JLabel usersFrameLabel = new JLabel();
		JTextField user = new JTextField();
		user.setBounds(130,50,200,30);
		JPasswordField pass = new JPasswordField();
		pass.setBounds(130,100,200,30);
		JLabel label = new JLabel();
		JLabel userLabel = new JLabel("User: ");
		JLabel passLabel = new JLabel("Password: ");
		JButton button = new JButton();
	    button.setBounds(130,150,200,30);
	    button.setText("Login");
	    button.addActionListener(new ActionListener() {
			@Override
	public void actionPerformed(ActionEvent e) {
		if (user.getText().trim().equals("") || pass.getText().trim().equals("")) {
		    JOptionPane.showMessageDialog(loginFrame , "Please Enter User and Password","Error" ,JOptionPane.ERROR_MESSAGE);
																			      }
		else {
			  if (user.getText().equals("admin") && pass.getText().equals("admin")) {
				  JOptionPane.showMessageDialog(loginFrame , "Successfully Login.","Success" ,JOptionPane.INFORMATION_MESSAGE);
				  usersFrame.setVisible(true);
				  loginFrame.setVisible(false);
																					}
		else {
			  JOptionPane.showMessageDialog(loginFrame , "Error Login.","Error" ,JOptionPane.ERROR_MESSAGE);
									}
										       }
            										 }
					});
		userLabel.setBounds(50,50,200,30);
		passLabel.setBounds(50,100,200,30);
		label.add(userLabel);
		label.add(passLabel);
		label.add(user);
		label.add(pass);
		label.add(button);
		loginFrame.add(label);
		loginFrame.setSize(400, 300);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setVisible(true);
		JLabel usersTextLabel = new JLabel("Number of Users");
		JLabel usersNoUtextLabel = new JLabel(String.valueOf(hussam.getUsersNumber()));
		usersTextLabel.setBounds(50,50,200,30);
		usersNoUtextLabel.setBounds(200,50,200,30);
		JButton addUsers = new JButton("Add Users");
		JButton viewUsers = new JButton("View Users");
		JButton logout = new JButton("Logout");
		viewUsers.setBounds(50,100,200,30);
		addUsers.setBounds(50,150,200,30);
		logout.setBounds(50,200,200,30);
				usersFrameLabel.add(usersTextLabel);
				usersFrameLabel.add(usersNoUtextLabel);
				usersFrameLabel.add(addUsers);
				usersFrameLabel.add(viewUsers);
				usersFrameLabel.add(logout);
        		usersFrame.add(usersFrameLabel);
				usersFrame.setSize(300, 300);
				usersFrame.setLocationRelativeTo(null);
				usersFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				logout.addActionListener(new ActionListener () {
										@Override
										public void actionPerformed(ActionEvent e) {
														usersFrame.setVisible(false);
														loginFrame.setVisible(true);
														}

					});
				 JTextArea textArea = new JTextArea(20, 20);
				 textArea.setEditable(false);
					  textArea.append(hussam.getUsers().toString());
				 JScrollPane scrollableTextArea = new JScrollPane(textArea);
				 scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       			 scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       			 JButton test = new JButton("BACK");
       			 test.setBounds(50,200,100,50);
       			 JPanel p = new JPanel(new BorderLayout());
				 viewUsersFrame.setSize(700, 700);
				 viewUsersFrame.setLocationRelativeTo(null);
				 viewUsersFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 p.add(scrollableTextArea , BorderLayout.NORTH );
				 p.add(test, BorderLayout.SOUTH);
				 viewUsersFrame.add(p);
				 viewUsers.addActionListener(new ActionListener () {
				 				@Override
				 				public void actionPerformed(ActionEvent e) {
										System.out.println(hussam.getUsers().toString());
				 					usersFrame.setVisible(false);
									viewUsersFrame.setVisible(true);
				 														}

					});
					test.addActionListener(new ActionListener () {
									 				@Override
									 				public void actionPerformed(ActionEvent e) {
														viewUsersFrame.setVisible(false);
														usersFrame.setVisible(true);
									 														}

					});
					JLabel addUserTextLabel = new JLabel();
					JTextField userNew = new JTextField();
					userNew.setBounds(130,50, 200,30);
					JPasswordField passNew = new JPasswordField();
					passNew.setBounds(130,100, 200,30);
					JTextField firstNew = new JTextField();
					firstNew.setBounds(130,150, 200,30);
					JTextField lastNew = new JTextField();
					lastNew.setBounds(130,200, 200,30);
					JLabel addUserNameTextLabel = new JLabel("UserName: ");
					addUserNameTextLabel.setBounds(50,50,200,30);
					JLabel addUserPassTextLabel = new JLabel("Password: ");
					addUserPassTextLabel.setBounds(50,100,200,30);
					JLabel addUserFirstTextLabel = new JLabel("FirstName: ");
					addUserFirstTextLabel.setBounds(50,150,200,30);
					JLabel addUserLastTextLabel = new JLabel("LastName: ");
				    addUserLastTextLabel.setBounds(50,200,200,30);
				    JButton addButton = new JButton("Add");
				    addButton.setBounds(130,250,200,30);
				    addUserTextLabel.add(addUserNameTextLabel);
				    addUserTextLabel.add(addUserPassTextLabel);
				    addUserTextLabel.add(addUserFirstTextLabel);
				    addUserTextLabel.add(addUserLastTextLabel);
				    addUserTextLabel.add(userNew);
				    addUserTextLabel.add(passNew);
				    addUserTextLabel.add(firstNew);
				    addUserTextLabel.add(lastNew);
				    addUserTextLabel.add(addButton);
				    addUserFrame.add(addUserTextLabel);
					addUserFrame.setSize(400, 500);
				    addUserFrame.setLocationRelativeTo(null);
					addUserFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					addUsers.addActionListener(new ActionListener () {
							@Override
								public void actionPerformed(ActionEvent e) {
									 	usersFrame.setVisible(false);
											addUserFrame.setVisible(true);
									 														}

					});
							addButton.addActionListener(new ActionListener () {
							@Override
								public void actionPerformed(ActionEvent e) {

									hussam.insertUser(userNew.getText(),passNew.getText(),firstNew.getText(),lastNew.getText());
									//System.out.println(userNew.getText()+","+passNew.getText()+","+firstNew.getText()+","+lastNew.getText());

									 	addUserFrame.setVisible(false);
										usersFrame.setVisible(true);
									 														}

					});
        //try (Connection connection = DriverManager.getConnection(databaseURL)) {

			/**
            String sql = "INSERT INTO Books (Full_Name, Email, Phone) VALUES (?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "Jim Rohn");
            preparedStatement.setString(2, "rohnj@herbalife.com");
            preparedStatement.setString(3, "0919989998");

            int row = preparedStatement.executeUpdate();

            if (row > 0) {
                System.out.println("A row has been inserted successfully.");
            }

            String sql = "SELECT * FROM books";

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                int id = result.getInt("ID");
                String title = result.getString("Title");
                String ISBN = result.getString("ISBN");
                String NOP = result.getString("NOP");

                System.out.println(id + ", " + title + ", " + ISBN + ", " + NOP);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        **/
    }
}