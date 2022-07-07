import java.util.Scanner;

	class StudentDeclarationInput
		
		{

			public static void main(String[] args)
			
				{
					Scanner sc= new Scanner(System.in);

					//Name
					System.out.println("Enter the Student's name :");
					String name =sc.nextLine();
					System.out.println("Student's name is:" +name);

					//Address
					System.out.println("Enter the Student's address :");
					String address =sc.nextLine();
					System.out.println("Student's address is:" +address);

					//Phone Number
					System.out.println("Enter the Student's Phone no :");
					long Phoneno =sc.nextLong();
					System.out.println("Student's Phone no is:" +Phoneno);

					//Gender
					System.out.println("Enter the Student's Gender :");
					char gender =sc.next().charAt(0);
					System.out.println("Student's Gender is:" +gender);

					//DOB
					System.out.println("Enter the Student's Date of Birth :");
					String birthDate =sc.next();
					System.out.println("Student's Date Of Birth is:" +birthDate);

					//Height
					System.out.println("Enter the Student's Height :");
					double height =sc.nextDouble();
					System.out.println("Student's name is:" +height);

					//Weight
					System.out.println("Enter the Student's weight :");
					int weight =sc.nextInt();
					System.out.println("Student's name is:" +weight);
			
					//Degree Pursued
					System.out.println("Enter the Student's Degree Pursued :");
					String degree =sc.next();
					System.out.println("Student's name is:" +degree);

					//Year of Study
					System.out.println("Enter the Student's Year Of Study :");
					int year =sc.nextInt();
					System.out.println("Student's name is:" +year);

					//Average CGPA
					System.out.println("Enter the Student's Average CGPA :");
					double cgpa =sc.nextDouble();
					System.out.println("Student's Average CGPA is:" +cgpa);

					//with/without tuition grant
					System.out.println("Enter the Student's with/without tuition grant :");
					String tg =sc.next();
					System.out.println("Student with/without tuition grant ?:" +tg);

					//is/is not a scholar
					System.out.println("Enter the Student's is/is not a scholar :");
					String scholarOrNot =sc.next();
					System.out.println("Student is/is not a scholar ?:" +scholarOrNot);

					//unique 8-digit number as id.
					System.out.println("Enter the Student's unique 8-digit number as id :");
					int id =sc.nextInt();
					System.out.println("Student's unique 8-digit number as id is:" +id);



				
					

				}	

		}