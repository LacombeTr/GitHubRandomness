
// GenerateReport.java
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;

public class GenerateReport {
    public static void main(String[] args) {

        String[] phrases = {
                "Aujourd'hui, j'ai réussi à faire tourner ma chaise 360° 50 fois sans tomber.",
                "J'ai passé 20 minutes à dessiner des moustaches sur les photos des collègues dans le Slack.",
                "J'ai compté le nombre de tuiles au plafond... 237.",
                "J'ai renommé tous les fichiers de mon projet en ajoutant 'Final' à la fin.",
                "J'ai testé combien de crayons je pouvais tenir en équilibre sur mon nez.",
                "J'ai appris à faire des origamis avec des post-it.",
                "J'ai lancé un débat sur Slack pour savoir si l'ananas va sur la pizza.",
                "J'ai codé une application qui me dit combien de jours il reste avant le week-end.",
                "J'ai transformé ma pause-café en pause-équilibre d’agrafes.",
                "J'ai pris des photos de mes pieds sous le bureau pour un projet 'artistique'.",
                "J'ai écrit un poème en binaire.",
                "J'ai organisé un tournoi de lancer de boulettes de papier dans la poubelle.",
                "J'ai fait un vote pour élire le meilleur sandwich du bureau.",
                "J'ai envoyé des messages en morse à mon collègue.",
                "J'ai passé une heure à chercher des jeux de mots pour des commits Git.",
                "J'ai réalisé que je peux écrire mon nom en lettres majuscules avec des agrafes.",
                "J'ai fait une liste des pires blagues de développeurs.",
                "J'ai tenté de résoudre un Rubik's Cube... toujours pas réussi.",
                "J'ai compté combien de fois le téléphone de la réception sonne en une journée.",
                "J'ai découvert que je peux jongler avec des pommes.",
                "J'ai calculé combien de secondes il reste avant les vacances.",
                "J'ai redessiné le logo de l’entreprise... avec des macarons.",
                "J'ai imaginé des histoires drôles sur les bugs les plus courants.",
                "J'ai trié tous mes e-mails par ordre de longueur.",
                "J'ai appris à dire 'je m'ennuie' en 10 langues différentes.",
                "J'ai monté une pyramide de gobelets en plastique.",
                "J'ai joué à trouver le mot le plus long possible dans le code.",
                "J'ai passé une demi-heure à ajuster la luminosité de mon écran.",
                "J'ai réfléchi à l'idée de créer une appli pour éviter l'ennui au travail.",
                "J'ai fait une analyse détaillée du nombre de café que je bois par jour.",
                "J'ai dessiné des labyrinthes pour mes collègues.",
                "J'ai lu tous les termes et conditions de mon logiciel de messagerie.",
                "J'ai programmé un bot pour répondre 'LOL' à chaque message.",
                "J'ai écrit une chanson sur la lenteur des tests unitaires.",
                "J'ai essayé de battre mon record de clics de souris en une minute.",
                "J'ai imité le bruit de démarrage de Windows XP pour amuser le bureau.",
                "J'ai chronométré combien de temps il me faut pour manger un cookie.",
                "J'ai dessiné des caricatures de mes collègues.",
                "J'ai tenté de faire une tour en stylos qui tient plus de 10 secondes.",
                "J'ai créé un simulateur de machine à café en JavaScript.",
                "J'ai écrit une série de haïkus sur les réunions.",
                "J'ai joué à deviner les mots de passe des comptes de test.",
                "J'ai fait un concours de celui qui a le bureau le plus propre.",
                "J'ai passé en revue toutes les abréviations du code source.",
                "J'ai fabriqué une mini catapulte avec des élastiques et des trombones.",
                "J'ai appris à faire des tours de magie avec des cartes.",
                "J'ai transformé mes annotations de code en histoires épiques.",
                "J'ai compté combien de secondes je peux tenir en apnée en attendant une compilation.",
                "J'ai tenté d’expliquer le concept de la 'technique Pomodoro' à mon cactus.",
                "J'ai classé tous les emojis par ordre de fréquence d'utilisation."
        };

        Random random = new Random();
        int index = random.nextInt(phrases.length);

        LocalDate today = LocalDate.now();
        String report = "Rapport du jour dans ma vie de développeur pour le : " + today + "\n";
        report += "========================\n";
        report += phrases[index] + "\n";

        try (FileWriter writer = new FileWriter("daily_report.txt")) {
            writer.write(report);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}