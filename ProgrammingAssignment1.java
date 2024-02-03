class SY2022bit055{
           public static void main(String [] args){
           
           //2022bit055 ,2022bcs432,2022bch123,2022bme321 valid formats
           //years from 2000 to 2024 are valid
           
   String[] s = {"2021bcs100","2022bit100","2023bch099","2024bme101","2022bem045","2021bcs100", "2022bit100", "2023bch099", "2024bme101",  "2022bcs432","2025bch001","2023bcm099", "2022bme321" };
           
           int final_result = getValidRegistrationsCount(s);
           System.out.println(final_result);
           
           }
           
           public static int getValidRegistrationsCount(String s[]){
           		int count = 0;
           		for(int i=0;i<s.length;i++){
           			if(s[i].length() > 0 &&s[i].length()<=10){
           			
           				if(check_year(s[i]) && check_branch(s[i])){
           				count++;
           				}
           			}
           		}
           			return count;
           }
           
           public static boolean check_year(String G){
           		
           		String year = G.substring(0,4);
           		int valid_year = Integer.parseInt(year);
           		if(valid_year>=2000 && valid_year<=2024){
           			return true;
           		}
           		else{
           			return false;
           		}
           		
           }
           public static boolean check_branch(String G){
           		
           		String branch = G.substring(4,7);
           		if(branch.equals("bit") || branch.equals("bcs") || branch.equals("bch") || branch.equals("bme")){
           			return true;
           		}
           		else{
           			return false;
           		}	
           }         
      }
           
           
           
           
           
