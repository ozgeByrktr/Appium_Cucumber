@qd
Feature:

  Scenario Outline:Kullanıcı yanlıs e-Mail ve password ile siteye giris yapılamadıgını dogrular




  * Kullanıcı "qaUrl"ye gider
  * cookies'i kabul eder
  * Login butonuna tiklar
  * Kullanici Siteye yanlis "<email>" ve "<password>" ile giris yapilamadigini dogrular
  * Kullanici driveri kapatir
    Examples:
      | email || password|
      | yanlisEmail| |  yanlisPassword  |
      | yanlisEmail1 | | yanlisPassword1  |
      | yanlisEmail2 | | yanlisPassword2 |

