package service;

public class ParseLigne {

	public static long[] parseLigneRentab(String[] tab) {

		long[] tabFinale = new long[6];
		// rang 1 : court / rang 2 : moyen / rang 3 : long / rang 4 : très long
		if (tab[0].equals("'court'")) {
			tabFinale[0] = 1;
		} else if (tab[0].equals("'moyen'")) {
			tabFinale[0] = 2;
		} else if (tab[0].equals("'long'")) {
			tabFinale[0] = 3;
		} else if (tab[0].equals("'très long'")) {
			tabFinale[0] = 4;
		}
		// rang 1 : inconnu / rang 2 : peu populaire / rang 3 : populaire
		if (tab[1].equals("'inconnu'")) {
			tabFinale[1] = 1;
		} else if (tab[1].equals("'peu populaire'")) {
			tabFinale[1] = 2;
		} else if (tab[1].equals("'populaire'")) {
			tabFinale[1] = 3;
		}
		// rang 1 : peu populaire / rang 2 : populaire / rang 3 : très populaire
		if (tab[2].equals("'peu populaire'")) {
			tabFinale[2] = 1;
		} else if (tab[2].equals("'populaire'")) {
			tabFinale[2] = 2;
		} else if (tab[0].equals("'très populaire'")) {
			tabFinale[2] = 3;
		}
		// rang 1 : peu connus / rang 2 : moyennement connus/ rang 3 : très
		// connus
		if (tab[3].equals("'peu connus'")) {
			tabFinale[3] = 1;
		} else if (tab[3].equals("'moyennement connus'")) {
			tabFinale[3] = 2;
		} else if (tab[3].equals("'très connus'")) {
			tabFinale[3] = 3;
		}
		// 0 anglais / 1 autres langue
		tabFinale[4] = Long.parseLong(tab[4]);
		// rang 1 : petit budget / rang 2 : budget moyen / rang 3 : gros budget
		if (tab[5].equals("'petit budget'")) {
			tabFinale[5] = 1;
		} else if (tab[5].equals("'budget moyen'")) {
			tabFinale[5] = 2;
		} else if (tab[5].equals("'gros budget'")) {
			tabFinale[5] = 3;
		}

		return tabFinale;
	}

	public static long[] parseLigneImdb(String[] tab) {
		long[] tabFinale = new long[4];
		// rang 1 : court / rang 2 : moyen / rang 3 : long / rang 4 : très long
		if (tab[0].equals("'court'")) {
			tabFinale[0] = 1;
		} else if (tab[0].equals("'moyen'")) {
			tabFinale[0] = 2;
		} else if (tab[0].equals("'long'")) {
			tabFinale[0] = 3;
		} else if (tab[0].equals("'très long'")) {
			tabFinale[0] = 4;
		}
		// rang 1 : inconnu / rang 2 : peu populaire / rang 3 : populaire
		if (tab[1].equals("'inconnu'")) {
			tabFinale[1] = 1;
		} else if (tab[1].equals("'peu populaire'")) {
			tabFinale[1] = 2;
		} else if (tab[1].equals("'populaire'")) {
			tabFinale[1] = 3;
		}
		// rang 1 : peu populaire / rang 2 : populaire / rang 3 : très populaire
		if (tab[2].equals("'peu populaire'")) {
			tabFinale[2] = 1;
		} else if (tab[2].equals("'populaire'")) {
			tabFinale[2] = 2;
		} else if (tab[0].equals("'très populaire'")) {
			tabFinale[2] = 3;
		}
		// rang 1 : peu connus / rang 2 : moyennement connus/ rang 3 : très
		// connus
		if (tab[3].equals("'peu connus'")) {
			tabFinale[3] = 1;
		} else if (tab[3].equals("'moyennement connus'")) {
			tabFinale[3] = 2;
		} else if (tab[3].equals("'très connus'")) {
			tabFinale[3] = 3;
		}
		return tabFinale;
	}
}
