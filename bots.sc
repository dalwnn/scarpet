__config() -> {
    'stay_loaded' -> 'true',
    'scope' -> 'global'
};

__on_player_connects(player) -> (
    if (player ~ 'player_type' == 'fake',
        run(str('team join BOT %s', player));
    );
);