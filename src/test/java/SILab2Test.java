
import org.junit.Test;

import static org.junit.Assert.*;

        public class SILab2Test {

            @Test
            public void multipleConditions(){
                //if (user.getUsername()!=null && user.getEmail()!=null && !allUsers.contains(user.getUsername()))
                /*T && T && T-> , Username = Test, Email = student, allUsers = false
                T && T && F-> , Username = Test, Email = student, allUsers = true
                T && F && T-> , Username = Test, Email = null , allUsers = false
                T && F && F-> , Username = Test, Email = null, allUsers = true
                F && T && T-> , Username = null, Email = student, allUsers = false
                F && T && F-> , Username = null, Email = student, allUsers = true
                F && F && T-> , Username = null, Email = anything, allUsers = false
                F && F && F-> , Username = null, Email = anything, allUsers = true*/
                assertEquals(SILab2.function("Test", "Student", false));
                assertEquals(SILab2.function("Test", "Student", true));
                assertEquals(SILab2.function("Test", null, false));
                assertEquals(SILab2.function("Test", null, true));
                assertEquals(SILab2.function(null, "Student", false));
                assertEquals(SILab2.function(null, "Student", true));
                assertEquals(SILab2.function(null, null, false);
                assertEquals(SILab2.function(null, null, true));


                //if (atChar && user.getEmail().charAt(i)=='.')
                /*T && T -> atChar = true, charAt(i) = '.'
                T && F -> atChar = true, charAt(i) != '.'
                F && X -> atChar = false, charAt(i) = anything
                 */

                assertEquals(SILab2.atChar=true, user.getEmail(),charAt(i) = '.');
                assertEquals(SILab2.atChar=true, user.getEmail(),charAt(i) != '.');
                assertEquals(SILab2.atChar=false, dotChar == true);


                //if (atChar && dotChar)
                /*T && T -> atChar = true, dotChar = true
                T && F -> atChar = true, dotChar = false
                F && X -> atChar = false, dotChar = anything*/
                assertEquals(SILab2.atChar=true, dotChar = true);
                assertEquals(SILab2.atChar=true, dotChar = false);
                assertEquals(SILab2.atChar=false, dotChar = true);

            }

            public void EveryPathTest(){
                /*Според Every path критериумот кодот има 5 патеки со кои би се опфатиле сите тест случаи.
                1.
                username = NULL
                Password = NULL
                Email = NULL
                1 , 2 , 13 , 14
                Патеката кога нема да внесеме никакви податоци за корисникот и директно ќе не одведе до крај.
                2.
                username = Test
                Password = Pw
                Email = HoHO
                1 , 2 , 3, 13 , 14
                Патеката кога ќе ги внесеме податоците, но нема да ни се исполни if ( #3 ) независно за кое поле од податок не е исполнето бидејќи се работи за if со AND, исто така не води директно до крајот и ни враќа false.
                3.
                username = Test
                Password = Pass
                Email = student
                1 , 2 , 3, 4, (5.1, 5.2, 6, 8, 10, 5.3, 5.2), 11, 13, 14
                Патеката кога ќе ги внесеме податоците, но нема да ни се исполни критериумот зададен за email адресата т.е ни еден од if-овите во for циклусот ( не содржи @ и .)  и програмата ќе ни врати false и ќе не однесе до крајот.
                4.
                username = Test
                Password = Pass
                Email = student.
                1 , 2 , 3, 4, (5.1, 5.2, 6, 8, 9, 10, 5.3, 5.2), 11, 13, 14
                Патеката кога ќе ги внесеме податоците, но нема да ни се исполни критериумот зададен за email адресата т.е едниот критериум во конкретниот случај каде ќе ни фали знакот ( @ ) со што нема да влезе во едниот од if-овите во for циклусот и програмата ќе ни врати false за  boolean atChar и ќе не однесе до крајот.
                5.
                username = Test
                Password = Pass
                Email = student@
                1 , 2 , 3, 4, (5.1, 5.2, 6, 7, 8, 10, 5.3, 5.2), 11, 13, 14
                Патеката кога ќе ги внесеме податоците, но нема да ни се исполни критериумот зададен за email адресата т.е едниот критериум во конкретниот случај каде ќе ни фали точка ( . ) со што нема да влезе во едниот од if-овите во for циклусот и програмата ќе ни врати false за boolean dotChar и ќе не однесе до крајот.
                6.
                username = Test
                Password = Pass
                Email = student@gmail.com
                1 , 2 , 3, 4, (5.1, 5.2, 6, 7, 8, 9, 10, 5.3, 5.2), 11, 12, 13, 14
                Патеката кога ќе ги внесеме сите податоци според зададените критериуми и сите if-ови ќе ни поминат и влезат со што програмата ќе ни врати true и ќе не однесе до крајот.*/
                assertEquals(SILab2.function(NULL, NULL, NULL));
                assertEquals(SILab2.function("Test", "Pw", "HoHo"));
                assertEquals(SILab2.function("Test", "Pass", "student"));
                assertEquals(SILab2.function("Test", "Pass", "student."));
                assertEquals(SILab2.function("Test", "Pass", "student@"));
                assertEquals(SILab2.function("Test", "Pass", "student@gmail.com"));

            }

        }


