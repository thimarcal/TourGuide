package android.udacity.tourguide;

import android.content.Context;
import android.udacity.tourguide.data.VisitPlace;

import java.util.ArrayList;
import java.util.List;

/**
 * Util class for returning fake location places
 *
 * Data is not added to strings.xml due to this being only fake data.
 * In a real app, I would probably get these from some DB, or Firebase
 */
public class Utils {

    public static List<VisitPlace> getMagicKingdomPlaces(Context context) {
        List<VisitPlace> places = new ArrayList<>();

        VisitPlace castle = new VisitPlace();
        castle.setPlaceName(context.getString(R.string.cinderelas_castle));
        castle.setPlaceDescription(context.getString(R.string.cinderela_desc));
        castle.setPlaceImgResource(R.drawable.castle_place);

        places.add(castle);

        VisitPlace statue = new VisitPlace();
        statue.setPlaceName(context.getString(R.string.statue));
        statue.setPlaceImgResource(R.drawable.statue);
        statue.setPlaceDescription(context.getString(R.string.statue_desc));

        places.add(statue);

        return places;
    }

    public static List<VisitPlace> getHollywoodStudioPlaces(Context context) {
        List<VisitPlace> places = new ArrayList<>();

        VisitPlace hat = new VisitPlace();
        hat.setPlaceName(context.getString(R.string.hat));
        hat.setPlaceDescription(context.getString(R.string.hat_desc));
        hat.setPlaceImgResource(R.drawable.hat);
        places.add(hat);

        VisitPlace coaster = new VisitPlace();
        coaster.setPlaceName(context.getString(R.string.coaster));
        coaster.setPlaceDescription(context.getString(R.string.coaster_desc));
        coaster.setPlaceImgResource(R.drawable.rrcoaster);
        places.add(coaster);

        VisitPlace tower = new VisitPlace();
        tower.setPlaceName(context.getString(R.string.tower));
        tower.setPlaceDescription(context.getString(R.string.tower_desc));
        tower.setPlaceImgResource(R.drawable.tower_hotel);
        places.add(tower);

        return places;
    }

    public static List<VisitPlace> getEpcotCenterPlaces(Context context) {
        List<VisitPlace> places = new ArrayList<>();

        VisitPlace ball = new VisitPlace();
        ball.setPlaceName(context.getString(R.string.golf));
        ball.setPlaceDescription(context.getString(R.string.golf_desc));
        ball.setPlaceImgResource(R.drawable.golf_ball);
        places.add(ball);


        return places;
    }

    public static List<VisitPlace> getAnimalKingdomPlaces(Context context) {
        List<VisitPlace> places = new ArrayList<>();

        VisitPlace tree = new VisitPlace();
        tree.setPlaceName(context.getString(R.string.tree));
        tree.setPlaceDescription(context.getString(R.string.tree_desc));
        tree.setPlaceImgResource(R.drawable.tree_of_life);
        places.add(tree);

        VisitPlace safari = new VisitPlace();
        safari.setPlaceName(context.getString(R.string.safari));
        safari.setPlaceDescription(context.getString(R.string.safari_desc));
        safari.setPlaceImgResource(R.drawable.safari);
        places.add(safari);

        return places;
    }
}
