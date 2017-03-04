workspace.Dialog.DialogChoiceSelected:connect(function(player,choice)
	print(player.Name,choice.Name)
end)
workspace.Dialog.DialogChoiceSelected:connect(function(player,choice)
	if choice.Name == "No" then
		player.Character.Humanoid.Health = 0
	elseif choice.Name == "Yes" then
		player.Character.Humanoid.Health = 1000
	end
end)
