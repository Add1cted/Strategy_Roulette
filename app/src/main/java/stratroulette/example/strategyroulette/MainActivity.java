package stratroulette.example.strategyroulette;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.stratroulette.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] maps = new String[] {"Inferno", "Train", "Mirage", "Nuke", "Overpass", "Dust II", "Vertigo"};
        final String[] ctDos = new String[]{"Only one person may leave spawn. When that person dies, the next person leaves.", "180 your headset.", "No one can leave spawn.", "One person buys a gun and everyone else follows him and picks up the gun when he dies.", "Everyone buys a Zeus! Zeus and knives only!", "Deagles only!", "Buy 1 deagle. After 1 shot, you must pass it to a teammate", "Peek an enemy AWPer one by one with pistols only.", "You can only use the S key to move around.", "Deagles only! If you get a body shot, you have to follow up with a knife.", "Switch hands for your mouse and keyboard.", "Every time you kill an enemy, you must pick up the weapon he drops and use it for your next kill.", "Crouch only. Type '+duck' in console. If someone stands up, the others must kill him.", "Shotguns only.", "Only going foward is allowed, no sidestepping or going backwards.", "Jumpshots only.", "You may only move by jumping from one bullet hole on the floor to the next. You can shoot these bullet holes yourself.", "The richest player on the team must buy weapons for his teammates (as many as he can), and he must also give away his weapon he used in the previous round, the only weapons the buyer can use are pick-ups from killed enemies.", "You must stay as a group, one player at the front with an AWP (main cannon) two behind him with SMG's (coxial guns) and two behind them with SMG's as well.", "Whenever you die, you have to freestyle rap about how you died and say callouts by rapping.", "Whenever you see an enemey, do a 360 spin in real life before shooting.", "The top fragger becomes Simon, and the rest have to follow Simon and do exactly the same thing as Simon does.", "Everytime you kill enemy type on chat \"unityhacks.com\" or something like that.", "All callouts are now \"diggity\"", "Whenever an enemy is killed, everyone must freeze for 5 seconds", "You can only fire twice, then you must reload", "Play normally, but the last person alive must scream and/or type in chat \"WITNESS ME\" while going in alone to take down the remaining enemies.", "Whenever someone gets a kill, the team has to compliment him in chat.", "When the first person on your team gets a kill, everyone else must throw away their weapons and share the weapon that the first kill was made with (the golden gun).", "Teammates buy and give weapons to each other. At the end of the round the buyer has to claim back his/her weapon.", "One man tabs and commands the entire team (eg. green move to long doors, purple move to catwalk).", "All the players of the team must talk like pokemon by only saying their in-game name for the whole round.", "Everyone tries to ninja defuse.", "2 x two-man 'towers' anywhere, last man has to rush or ninja defuse.", "If the bomb is planted, you must wait till 15 seconds before detonation before pushing.", "Using nothing but a USP-S, smoke and 2 flashes, make it to T spawn and attack the site T's are pushing.", "Everyone has to buy bizons without kevlar and shiftwalk. Running or standing still is not allowed.", "All buy HE grenade and camp base. Bombard the first enemy that comes by.", "Use only silenced weapons/knives. Don't run.", "Mag-7's only!", "Everybody buys MP9s and whenever you have to shoot someone you have to leap in a direction and shoot midair. Especially when going around corners."};
        final String[] tDos = new String[] {"Only one person may leave spawn. When that person dies, the next person leaves.", "180 your headset.", "No one can leave spawn.", "One person buys a gun and everyone else follows him and picks up the gun when he dies.", "Everyone buys a Zeus! Zeus and knives only!", "Deagles only!", "Buy 1 deagle. After 1 shot, you must pass it to a teammate", "Peek an enemy AWPer one by one with pistols only.", "You can only use the S key to move around.", "Deagles only! If you get a body shot, you have to follow up with a knife.", "Switch hands for your mouse and keyboard.", "Every time you kill an enemy, you must pick up the weapon he drops and use it for your next kill.", "Crouch only. Type '+duck' in console. If someone stands up, the others must kill him.", "Shotguns only.", "Only going foward is allowed, no sidestepping or going backwards.", "Jumpshots only.", "You may only move by jumping from one bullet hole on the floor to the next. You can shoot these bullet holes yourself.", "The richest player on the team must buy weapons for his teammates (as many as he can), and he must also give away his weapon he used in the previous round, the only weapons the buyer can use are pick-ups from killed enemies.", "You must stay as a group, one player at the front with an AWP (main cannon) two behind him with SMG's (coxial guns) and two behind them with SMG's as well.", "Whenever you die, you have to freestyle rap about how you died and say callouts by rapping.", "Whenever you see an enemey, do a 360 spin in real life before shooting.", "The top fragger becomes Simon, and the rest have to follow Simon and do exactly the same thing as Simon does.", "Everytime you kill enemy type on chat \"unityhacks.com\" or something like that.", "All callouts are now \"diggity\"", "Whenever an enemy is killed, everyone must freeze for 5 seconds", "You can only fire twice, then you must reload", "Play normally, but the last person alive must scream and/or type in chat \"WITNESS ME\" while going in alone to take down the remaining enemies.", "Whenever someone gets a kill, the team has to compliment him in chat.", "When the first person on your team gets a kill, everyone else must throw away their weapons and share the weapon that the first kill was made with (the golden gun).", "Teammates buy and give weapons to each other. At the end of the round the buyer has to claim back his/her weapon.", "One man tabs and commands the entire team (eg. green move to long doors, purple move to catwalk).", "All the players of the team must talk like pokemon by only saying their in-game name for the whole round.", "Everyone buys Duel Berettas and crouch rushes any site.", "You can't have the bomb in your inventory for more than 5 seconds; you must throw it to someone else before time's up.", "Plant at one site, only after passing through the other.", "Run up to A site. As soon as you get a kill, turn around and the whole team rushes back to B. Rinse and repeat until a clear bombsite is reached or all CTs are eliminated.", "5 x tec-9's or p90's, 5 x 2 flashes, Take over any bombsite with all 10 flashes because if you're blind, they're blind.", "5 man. P90 only.", "Travel around in a group around the map. Wield the Glock and hold down right mouse button switching between single- and burst-fire.", "Try to plant the bomb using only grenades. Only after planting the bomb may you switch to your weapon of choice.", "You must wait until the timer is at 0:15 before entering a bombsite.", "Give the bomb to CTs, rotate back around the entire map dodging CT rotates and 'retake' the bomb."};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.listview_layout, maps);
        ListView listView = (ListView) findViewById(R.id.mapList);
        listView.setAdapter(adapter);

        AdapterView.OnItemClickListener messageClickedHandler = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                switch( position )
                {
                    case 0:  Intent infernoActivity = new Intent(v.getContext(), Inferno.class);
                        infernoActivity.putExtra("tStrats", tDos);
                        infernoActivity.putExtra("ctStrats", ctDos);
                        startActivity(infernoActivity);
                        break;
                    case 1:  Intent trainActivity = new Intent(v.getContext(), Train.class);
                        trainActivity.putExtra("tStrats", tDos);
                        trainActivity.putExtra("ctStrats", ctDos);
                        startActivity(trainActivity);
                        break;
                    case 2:  Intent mirageActivity = new Intent(v.getContext(), Mirage.class);
                        mirageActivity.putExtra("tStrats", tDos);
                        mirageActivity.putExtra("ctStrats", ctDos);
                        startActivity(mirageActivity);
                        break;
                    case 3:  Intent nukeActivity = new Intent(v.getContext(), Nuke.class);
                        nukeActivity.putExtra("tStrats", tDos);
                        nukeActivity.putExtra("ctStrats", ctDos);
                        startActivity(nukeActivity);
                        break;
                    case 4:  Intent overpassActivity = new Intent(v.getContext(), Overpass.class);
                        overpassActivity.putExtra("tStrats", tDos);
                        overpassActivity.putExtra("ctStrats", ctDos);
                        startActivity(overpassActivity);
                        break;
                    case 5:  Intent dustActivity = new Intent(v.getContext(), Dust2.class);
                        dustActivity.putExtra("tStrats", tDos);
                        dustActivity.putExtra("ctStrats", ctDos);
                        startActivity(dustActivity);
                        break;
                    case 6:  Intent vertigoActivity = new Intent(v.getContext(), Vertigo.class);
                        vertigoActivity.putExtra("tStrats", tDos);
                        vertigoActivity.putExtra("ctStrats", ctDos);
                        startActivity(vertigoActivity);
                        break;
                }
            }
        };

        listView.setOnItemClickListener(messageClickedHandler);
    }


}
