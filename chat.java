workspace.Dialog.DialogChoiceSelected:connect(function(player,choice)
	print(player.Name,choice.Name)
end)
workspace.Dialog.DialogChoiceSelected:connect(function(player,choice)
	if choice.Name == "hello im admin" then
		player.Character.Humanoid.Health = 0
	elseif choice.Name == "i was made by mwear3" then
		player.Character.Humanoid.Health = 1000
	end
end)
